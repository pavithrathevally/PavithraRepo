package driver_script;
import java.lang.reflect.Method;
import config.UIActionKeywords2;
import utility.KeyWordExcel2;
public class ScriptExecutorReflection2 
{
		public static UIActionKeywords2 actionKeywords;
		public static String sActionKeyword;
		public static Method method[];
		public ScriptExecutorReflection2() throws Exception
		{
			actionKeywords = new UIActionKeywords2();
			method = actionKeywords.getClass().getMethods();
		}
		private void execute_Actions() throws Exception
		{
			
			for(int i = 0;i<method.length;i++)
			{
				if(method[i].getName().equals(sActionKeyword))
				{
					method[i].invoke(actionKeywords);
					break;
				}
			}
			
		}	

		public static void main(String[] args) throws Exception 
		{
			ScriptExecutorReflection2 sr = new ScriptExecutorReflection2();
			String path = "D:\\Selenium\\KeywordDriven.xlsx";
			KeyWordExcel2.setExcelFile(path, "Sheet2");
			for(int iRow = 1;iRow<=6;iRow++)
			{
				sActionKeyword = KeyWordExcel2.getCellData(iRow, 3);
				sr.execute_Actions();
			}
			
		}

	}
