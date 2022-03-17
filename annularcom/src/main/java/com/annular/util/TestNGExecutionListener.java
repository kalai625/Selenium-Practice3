package com.annular.util;

import org.testng.IExecutionListener;

public class TestNGExecutionListener implements IExecutionListener {
	@Override
	public void onExecutionStart() {

	}

	@Override
	public void onExecutionFinish() {

		GenerateReport.GenerateMasterthoughtReport();

	}
}
