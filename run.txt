set projectLocation=C:\Users\PC\eclipse-workspace\Examples
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml