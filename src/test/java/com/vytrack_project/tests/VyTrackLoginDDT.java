package com.vytrack_project.tests;

import com.vytrack_project.pages.VyTrackDashboardPage;
import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.ConfigurationReader;
import com.vytrack_project.vytrack_utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VyTrackLoginDDT {

    VyTrackLoginPage loginPage = new VyTrackLoginPage();
    VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void loginDDT() throws IOException {
        String filePath = "VyTrackQa2Users.xlsx";
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("data");

        for (int i = 1; i <= sheet.getLastRowNum(); i++){
            String userName = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            String firstName = sheet.getRow(i).getCell(2).toString();
            String lastName = sheet.getRow(i).getCell(3).toString();

            loginPage.login1(userName, password);
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            String actualFullName = dashboardPage.fullName.getText();

            XSSFCell resultCell = sheet.getRow(i).getCell(4);

            if(actualFullName.contains(firstName) && actualFullName.contains(lastName)){
                System.out.println("PASS");
                resultCell.setCellValue("PASS");
            } else {
                System.out.println("FAIL");
                resultCell.setCellValue("FAIL");
            }

            dashboardPage.logout();
        }

        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);

        in.close();
        out.close();
        workbook.close();
    }



}
