package com.annular.actions;

import com.annular.pages.HomePage;
import com.annular.util.AnnulartechDriver;

public class HomePageSteps extends HomePage {

	public HomePageSteps(AnnulartechDriver driver) {
		super(driver);
		this.driver = driver;
	}
}