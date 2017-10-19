
package candiate_elimination;

public class Candiate_elimination {

    public static void main(String[] args) {
         //Data ----------------------------------------------------------------
    String data [][]={{"sunny","warm","normal","strong","warm","same","yes"},
                      {"sunny","warm","high","strong","warm","same","yes"},
                      {"rainy","cold","high","strong","warm","change","no"}
                     ,{"sunny","warm","high","strong","cool","change","yes" }};
        //End Data--------------------------------------------------------------
        
        String specific_array[]={"alpha","alpha","alpha","alpha","alpha","alpha"};
        String general_array[]={"?","?","?","?","?","?"};
        
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                if(data[i][6].equals("yes")){
                    //For Using -S Algorthim
                    if(i==0 && j!=6){     
                    specific_array[j]=data[i][j];
                    System.out.print(specific_array[j]+"\t");
                          }
                     else if(j!=6){
                      if(data[i][6].equals("yes")){
                          if(specific_array[j]==data[i][j]){
                              
                          }
                          else{
                              specific_array[j]="?";
                          }
                      }
                      System.out.print(specific_array[j]+"\t");
                      
                  }      
                   //Condition for IF data tranning set is No
//                     else if(j!=6){
//                         if(data[i][6].equals("no")){
//                             System.out.print(specific_array[j]+"\t");
//                         }
                         
//                     }
//                    
                }
                else if (data[i][6].equals("no")){
                  //  For List Then-Elimination Algorithm
                     if(j!=6){
                      
                             if(j==0){
                            if(data[i][0].equals("rainy")){
                                
                                general_array[0]="sunny";
                                if(general_array[0]==specific_array[1]){
                                for(int p=0;p<general_array.length;p++){
                                    System.out.print(general_array[p]+"\t");
                                }
                                System.out.println("");
                            }  
                            }
                            else if(data[i][0].equals("sunny")){
                                general_array[0]="rainy";
                        }
                    }
                    else if(j==1){
                            if(data[i][1].equals("cold")){
                                general_array[1]="warm";    general_array[0]="?";
                                if(general_array[1]==specific_array[1]){
                                  for(int p=0;p<general_array.length;p++){
                                    System.out.print(general_array[p]+"\t");
                                }
                                }
                                  System.out.println("");
                            }     
                    }
                    else if(j==2){
                            if(data[i][2].equals("high")){
                                general_array[2]="normal";
                                general_array[0]="?";  general_array[1]="?";
                                if(general_array[2]==specific_array[1]){
                                  for(int p=0;p<general_array.length;p++){
                                  System.out.print(general_array[p]+"\t");
                                }
                                }
                                  System.out.println("");
                        }     
                    }
                    else if(j==3){
                            if(data[i][3].equals("strong")){
                                general_array[3]="weak";
                                general_array[0]="?"; general_array[1]="?"; general_array[2]="?";
                                 if(general_array[3]==specific_array[1]){
                                for(int p=0;p<general_array.length;p++){
                                     System.out.print(general_array[p]+"\t");
                                }
                                 }
                                  System.out.println("");
                        }
                    }
                    else if(j==4){
                        if(data[i][4].equals("warm")){
                            general_array[4]="cool";
                             general_array[0]="?"; general_array[1]="?"; general_array[2]="?"; general_array[3]="?";
                              
                             if(general_array[4]==specific_array[2]){
                             for(int p=0;p<general_array.length;p++){
                            
                                   System.out.print(general_array[p]+"\t");
                            }}
                               System.out.println("");
                              }
                                  }
                      else if(j==5){
                        if(data[i][5].equals("change")){
                            general_array[5]="same";
                            general_array[0]="?"; general_array[1]="?"; general_array[2]="?"; general_array[3]="?"; general_array[4]="?";
                              
                              if(general_array[5]==specific_array[1]){
                               for(int p=0;p<general_array.length;p++){
                                 System.out.print(general_array[p]+"\t");
                            }
                              }
                               System.out.println("");
        }    } 
                         
               }
                }
            }
            System.out.println(" ");
        }
    }
}