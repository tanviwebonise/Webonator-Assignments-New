import java.io.*;

	public class Comp {
		public static void getClassName(String line)
                {
                        String s2[]=line.split(" ");
         
                        for(int i=0;i<s2.length-1;i++)
                        {
                            if(s2[i].equals("class"))//&& s2[i+2].equals("{"))
                            {
                                System.out.println("Class name is:"+s2[i+1]);
                            }
                        }
            
        	 
                }
                public static void getJava_MethodName(String line)
                {
                    String trim_line=line.trim();
                    String s3[]=trim_line.split(" ");
                    String access_specifier=s3[0];
                    
                    for(int i=0;i<s3.length-1;i++)
                    {
                        if(s3[i].contains("("))
                        {
                            System.out.println("Method_name:"+s3[i]);
                         System.out.println("Access_specifier:"+access_specifier);
                        }
                        
                    }
                   
                    System.out.println();
                }
                public static void getPhp_MethodName(String line)
                {
                    String trim_line=line.trim();
                    String s3[]=trim_line.split(" ");
                   // String access_specifier=s3[0];
                    
                    for(int i=0;i<s3.length-1;i++)
                    {
                        if(s3[i].equals("function"))
                        {
                            
                                                            
                            System.out.println("Method_name:"+s3[i+1]);
                            if(s3[0].equals("function"))
                         System.out.println("Access_specifier:");
                            else
                                System.out.println("Access_specifier:"+s3[i-1]);
                        }
                        
                        
                    }
                   
                    System.out.println();
                }
                 public static void getRubyMethodName(String line)
                {
                    String trim_line=line.trim();
                    String s4[]=trim_line.split(" ");
                   
                    
                    for(int i=0;i<s4.length-1;i++)
                    {
                        if(s4[i].contains("def"))
                        System.out.println("Method_name:"+s4[i+1]);
                    }
                   
                    System.out.println();
                }
               /* public static void getVariableName(String line)
                {
                        //String s2[]=line.split(" ");
         
                        for(int i=0;i<s2.length-1;i++)
                        {
                            if(s2[i].equals("class"))//&& s2[i+2].equals("{"))
                            {
                                System.out.println("Class name is:"+s2[i+1]);
                            }
                        }
            
        	 
                }*/
		
		 public static void main(String[] args)throws IOException, ClassNotFoundException
		    {
		         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		         System.out.println("Enter your choice of file.:");
		         String s=br.readLine();
		         String java_regx1="(public|private|protected|\\s|\\t)*[\\s]*class[\\s]+[A-Z]+([a-z]|[0-9]|[_])*[\\s]*[\\{][\\s]*";
		         String java_regx2="^i?import[\\s]+java[.]\\z";
		         String ruby_regx1="^?([\\s]|[\\w]|[\\t])*[def][\\s]+([a-z]+([a-z]|[A-Z])*)+([\\s]|[\\w]|[\\W]|[\\(])*[\\s]*\\z";
		         String php_regx1="^?[\\<]+[\\?]+[php]+\\z";
		         String php_regx2="^?[var]+[\\s]+[\\$]+[A-Z|a-z|_]+\\z";
		         String ruby_regx2="^?[\\@@]+[a-z]\\z";
                        String variable_regx="(public|protected|private)*[\\s]*[\\w]*[\\s]*[\\w]+[\\;]";
                         String php_class_regx="[\\s|\\t]*class[\\s]+[\\w]+[\\s]+[extends|implements]*[\\s]*[\\w]*[\\s]*[\\{]+[\\s]*";
                         String php_method_regx="([\\s]|[\\t])*(public|private|protected)*[\\s]+function[\\s]+[\\w]+[\\(]([\\w]|[\\$]|[\\=]|[\\s])*[\\)][\\s]*[\\{]";
                         String ruby_class_regx="[\\s|\\t]*class[\\s]+[\\w]+[\\s]*[\\{]*";
                         String java_method_regx="[\\s]*(public|private|protected)[\\s][\\w]+[\\s][a-z]+([A-Z]|[0-9]|[_]|[a-z])*[\\s]*[\\(]([\\w]|[\\s])*[\\)][\\s]*[\\{]";
		         //String j="(public|private|protected)[\\s]+(static)*[\\s]*(void)[\\s]+(main)[\\s]*\\(";
		         
		         System.out.println("Working Directory = " +
	                     System.getProperty("user.dir")+"/"+s);
	             
	             String path= System.getProperty("user.dir").concat("/").concat(s);
	             //System.out.println(path);
		       
	             File f = new File(path);
	             
	       	     if(f.exists())
	       	     {
	       		     System.out.println("File existed");
	       	     }else
	       	     {
	       		     System.out.println("File not found!");
	       	     }
	       	     FileReader in=new FileReader(f);
		         BufferedReader b=new BufferedReader(in);
		         FileReader in1=new FileReader(f);
		         BufferedReader b1=new BufferedReader(in1);
                         FileReader in2=new FileReader(f);
		         BufferedReader b2=new BufferedReader(in2);
                          FileReader in3=new FileReader(f);
		         BufferedReader b3=new BufferedReader(in3);
		         String a;
		         String a1,a2,a3;
		         while((a=b.readLine())!=null)
		         {
		        	 if(a.matches(java_regx2)||a.matches(java_regx1))
                                { 
                                    System.out.println("Inputed file is java file");
                                    break;
                                }
                     
                     
                                if(a.matches(php_regx1)||a.matches(php_regx2))
                                {
                         
                                    System.out.println("Inputed file is php file");
                                    break;
                                } 
                                if(a.matches(ruby_regx1)||a.matches(ruby_regx2))
                                {
                                    System.out.println("Inputed file is ruby file");
                                    break;
                                }
                    
                         
		         }
              
              //.............TESTCASE 2............
              
         while((a1=b1.readLine())!=null)
                 {
                     // System.out.println("....");
                     if(a1.matches(java_regx1))
                     {
                        // System.out.println("....");
                         getClassName(a1);
                        // break;
                     }
                     else if(a1.matches(php_class_regx))
                     {
                        // System.out.println("....");
                         getClassName(a1);
                         //break;
                     }
                     else if(a1.matches(ruby_class_regx))
                     {
                        // System.out.println("....");
                         getClassName(a1);
                         //break;
                         
                     }
                    
                    
                 } 
               //..................Test case3
         //........................
                 while((a2=b2.readLine())!=null)
                 {
                     if(a2.matches(java_method_regx))
                     {
                         getJava_MethodName(a2);
                     }
                     if(a2.matches(ruby_regx1))
                     {
                         //System.out.println("........");
                         getRubyMethodName(a2);
                     }
                     if(a2.matches(php_method_regx))
                     {
                        getPhp_MethodName(a2);
                     }
                 }
                 //..............testcase 4
                /*  while((a3=b3.readLine())!=null)
                 {
                     if(a3.matches(variable_regx))
                     {
                         //getJava_MethodName(a2);
                         System.out.println(a);
                         
                     }
                    /* if(a2.matches(ruby_regx1))
                     {
                         //System.out.println("........");
                         getRubyMethodName(a2);
                     }
                     if(a2.matches(php_method_regx))
                     {
                        getPhp_MethodName(a2);
                     }*/
              //   }
               
              
                
		  

		
			
		

	
			
		}
		            
}
	
	





