package com.letzautomate.datasourcesutils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.testng.log4testng.Logger;

public class CSVFile{
	private static Logger logger = Logger.getLogger(CSVFile.class);
	public void createCSVFile(String filePath, String header){
		logger.info("Creating new CSV File " + filePath);
		try{
			File file = new File(filePath);
			if (file.getAbsoluteFile().exists()){
				FileUtils.forceDelete(file);
				file.getAbsoluteFile().createNewFile();
			}
			file.getAbsoluteFile().createNewFile();
			updateCSVFile(filePath, header);
		} catch (IOException e){
			logger.error("Exception", e);

		}
		logger.info("CSV File created successfully " + filePath);

	}
	public void updateCSVFile(String fileName, String line){
		logger.info("Updating CSV File" + fileName);
		try{
			FileWriter fileWriter = new FileWriter(fileName, true);
			fileWriter.append(line);
			fileWriter.append("/n");
			fileWriter.close();
		} catch(IOException e){
			logger.error("Exception..! ", e);
		}
		logger.info("CSV file created succedssfully. " + fileName);
	}
}
