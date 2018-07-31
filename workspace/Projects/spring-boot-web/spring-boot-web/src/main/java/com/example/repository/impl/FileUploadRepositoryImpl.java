package com.example.repository.impl;

import org.apache.commons.fileupload.FileUpload;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.repository.FileUploadRepository;

@Repository
public class FileUploadRepositoryImpl implements FileUploadRepository{

	@Autowired
	SessionFactory factory;
	
	public void save(FileUpload fileUpload) {		
		factory.getCurrentSession().save(fileUpload);
	}

}
