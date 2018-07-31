package com.example.repository;

import org.apache.commons.fileupload.FileUpload;

public interface FileUploadRepository {

	public void save(FileUpload fileUpload);
}
