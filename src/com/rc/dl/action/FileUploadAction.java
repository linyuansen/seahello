package com.rc.dl.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements ServletRequestAware ,ServletResponseAware{
	

		private File userImage;

		private String userImageContentType;

		private String userImageFileName;

		public String execute()
		{
			return SUCCESS;
		}

		public File getUserImage() {
			return userImage;
		}

		public void setUserImage(File userImage) {
			this.userImage = userImage;
		}

		public String getUserImageContentType() {
			return userImageContentType;
		}

		public void setUserImageContentType(String userImageContentType) {
			this.userImageContentType = userImageContentType;
		}

		public String getUserImageFileName() {
			return userImageFileName;
		}

		public void setUserImageFileName(String userImageFileName) {
			this.userImageFileName = userImageFileName;
		}

		@Override
		public void setServletResponse(HttpServletResponse arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setServletRequest(HttpServletRequest arg0) {
			// TODO Auto-generated method stub
			
		}

}


