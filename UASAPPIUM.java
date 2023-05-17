from time import sleep

from appium import webdriver
from appium.webdriver.common.appiumby import appiumby

caps = {
    "appPackage": "com.instagram.android",
    "appActivity": "com.instagram.android.activity.MainTabActivity",
    "noReset": True,
    "platformName": "android",
    "automationName": "UiAutomator2",
    "newCommandTimeout": "3600"
}
driver = webdriver.remote('http://localhost:4723',caps)
driver.implicitly_wait(30)

el4 = driver.find_element(by=appiumby.ACCESSIBILITY_ID, value="search and explore")
el4.click()
el5 = driver.find_element(by=appiumby.ACCESSIBILITY_ID, value="reels")
el5.click()
el6 = driver.find_element(by=appiumby.ACCESSIBILITY_ID, value="shop")
el6.click()
el7 = driver.find_element(by=appiumby.ID, value="feed_tab")
el7.click()

sleep(5)
driver.quit()