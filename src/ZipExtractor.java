import java.io.File;
import java.io.FilenameFilter;

public class ZipExtractor {

	public static void main(String[] args) {
		
		
		
		String path0 ="C:/Users/shuowang/Desktop/weather2016/04";
		String path00 ="C:/Users/shuowang/Desktop/weather2016unzipped/04";
		File folder1 = new File(path0);
//		for(String a0:folder0.list())
//		{
//			File folder1 = new File(path0+"/"+a0);
//			if (folder1.isDirectory())
//			{
//				String path1 = path0+"/"+a0;
		String path1 = path0;
				for(String a1:folder1.list())
				{
					File folder2 = new File(path1+"/"+a1);
					if (folder2.isDirectory())
					{
						String path2 = path1+"/"+a1;
						for(String a2:folder2.list())
						{
							File folder3 = new File(path2+"/"+a2);
							if (folder3.isDirectory())
							{
								String path3 = path2+"/"+a2;
								for(String a3:folder3.list())
								{
									File folder4 = new File(path3+"/"+a3);
									if (folder4.isDirectory())
									{
										String path4 = path3+"/"+a3;
										for(String a4:folder4.list())
										{
											File folder5 = new File(path4+"/"+a4);
											if (folder5.isDirectory())
											{
												String path5 = path4+"/"+a4;
												for(String a5:folder5.list())
												{
													String zipFilePath = path5 + "/" + a5;
//													File dir = new File(path00+"/"+a0);
//													if(!dir.exists()){dir.mkdir();}
													File dir1 = new File(path00+"/"+"/"+a3);
													if(!dir1.exists()){dir1.mkdir();}
													File dir2 = new File(path00+"/"+"/"+a3+"/"+a4);
													if(!dir2.exists()){dir2.mkdir();}
													String destDirectory = path00+"/"+"/"+a3+"/"+a4;
													System.out.println(zipFilePath);
													UnzipUtility unzipper = new UnzipUtility();
													try 
													{
											            unzipper.unzip(zipFilePath, destDirectory);
											        } 
													catch (Exception ex) 
													{
											            // some errors occurred
											            ex.printStackTrace();
											        }
												}
											}
										}
									}
								}
							}
						}
					}
				}
//			}
//		}
		



		
//		String zipFilePath = "e:/Test/MyPics.zip";
//        String destDirectory = "f:/Pics";
//        UnzipUtility unzipper = new UnzipUtility();
//        try {
//            unzipper.unzip(zipFilePath, destDirectory);
//        } catch (Exception ex) {
//            // some errors occurred
//            ex.printStackTrace();
//        }
	}

}
