package com.annular.util;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {

	public static void removeHooks(String jsonFile) throws Exception {
		String jsonValue = FileUtils.readFileToString(new File(jsonFile), StandardCharsets.UTF_8);
		jsonValue = jsonValue.replace("\"before\": [", "\"replacedToRemoveHook\": [");

		FileUtils.writeStringToFile(new File(jsonFile), jsonValue);

	}

	public static void GenerateMasterthoughtReport() {
		try {

			File reportOutputDirectory = new File("target/Report");
			List<String> list = new ArrayList<String>();
			String reportFolder = new File("target/surefire-reports/json").getAbsolutePath();
			File folder = new File(reportFolder);
			File[] listOfFiles = folder.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				list.add(listOfFiles[i].getPath());
				removeHooks(listOfFiles[i].getPath());
			}

			Configuration configuration = new Configuration(reportOutputDirectory, "Sample - UI Automation");
			configuration.setBuildNumber("Version - 1.0");

			ReportBuilder reportBuilder = new ReportBuilder(list, configuration);
			reportBuilder.generateReports();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
