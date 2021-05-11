package com.TestNG_Project;

import org.testng.annotations.Test;

public class Priority1_Test {


@Test(priority=-2 )
private void mobile() {
	System.out.println("mobile");
}

@Test(priority=-3)
private void laptop() {
	System.out.println("laptop");
}

@Test(priority=-1)
private void powerbank() {
	System.out.println("powerbank");
}

@Test(priority=0)
private void earphones() {
	System.out.println("earphones");
}

@Test(priority=1)
private void airbbuds() {
	System.out.println("airbuds");
}

@Test(priority=2)
private void backcase() {
	System.out.println("backcase");
}

@Test(priority=3)
private void headset() {
	System.out.println("headset");
}


}
