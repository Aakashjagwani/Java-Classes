package com.controller;



import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dao.productDAO;
import com.vo.productImageVO;
import com.vo.productVO;

@Controller

public class ProductImageController{
	
	@Autowired
	productDAO productdao;
	
	@RequestMapping(value ="/productImage.html", method = RequestMethod.POST)
	public ModelAndView upload(@ModelAttribute productVO pvo, @RequestParam("file") List<CommonsMultipartFile> file,HttpSession session,HttpServletRequest request){ 
		
		System.out.println(file.size());
		
		for(int j=0;j<file.size();j++)
		{
		String path=session.getServletContext().getRealPath("/");
		
		String pathFInal=path+"\\doc";
		System.out.println("path---------------------"+pathFInal);
		
		
        String filename=file.get(j).getOriginalFilename();  
        System.out.println(filename);
        System.out.println("file name........!!!!"+filename);
        
        System.out.println(path+" "+filename);  
        try{  
        byte barr[]=file.get(j).getBytes();  
          
        BufferedOutputStream bout=new BufferedOutputStream(  
                 new FileOutputStream(pathFInal+"\\"+filename));  
        bout.write(barr);  
        bout.flush();  
        bout.close();  
          
        }catch(Exception e){
        	System.out.println(e);
        	} 
	
		pvo.setProductImageName(filename);
        pvo.setProductImageEnc(pathFInal);
        
        productdao.insertProductImage(imgvo);
		
		}
        return new ModelAndView("redirect:/product.html");
        }

	private String encryptFileName(String fileName){

		Random r = new Random();
		String file[] = fileName.split("\\.");

		byte[] unencodedFile = file[0].getBytes();
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (Exception e) {}
		md.reset();
		md.update(unencodedFile);
		byte[] encodedFile = md.digest();
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < encodedFile.length; i++) {
			if (((int) encodedFile[i] & 0xff) < 0x10) {
				buf.append("0");
			}
			buf.append(Long.toString((int) encodedFile[i] & 0xff, 16));
		}

		String encryptedFileName=(buf.toString()).concat(String.valueOf(r.nextInt())); 


		return encryptedFileName+"."+file[file.length-1];

	}


}
