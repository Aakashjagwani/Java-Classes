package com.example.service.impl;

import org.apache.commons.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.FileUploadRepository;
import com.example.service.FileUploadService;

@Service
@Transactional(propagation=Propagation.SUPPORTS, readOnly=false)
public class FileUploadServiceImpl implements FileUploadService{

	@Autowired
	FileUploadRepository fileUploadRepository;	
	
	public void save(FileUpload fileUpload) {
		fileUploadRepository.save(fileUpload);		
	}

}
