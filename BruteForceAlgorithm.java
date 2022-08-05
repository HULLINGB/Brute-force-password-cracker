import java.util.*;

public class BruteForceAlgorithmOriginal{

     public static void main(String []args){


        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                            "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F",
							"G", "H", "I", "J","K" ,"L", "M","O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
							"Y", "Z", "1", "2", "3", "4", "5", "6" , "7", "8", "9", "0", "!", "@", "#", "$", "%",
							"^", "&", "*", "(", ")", "+", "-",  "="};
            
        String entry1 = "";
        String entry2 = "";
        String entry3 = "";
        String entry4 = "";
        String entry5 = "";
        String entry6 = "";
        String entry7 = "";
        String entry8 = "";
        String entry9 = "";
        String entry10 = "";
        String entry11 = "";
        String entry12 = "";
        String entry13 = "";
        String entry14 = "";
        String entry15 = "";
        String entry16 = "";
        String entry17 = "";
        String entry18 = "";
        String entry19 = "";
        String entry20 = "";


        for(int a = 0; a < array.length; a++)
        {
            
            entry1 = array[a];
            
            for(int b = 0; b < array.length; b++)
            {
                
                entry2 = array[b];
                
                for(int c = 0; c < array.length; c++)
                {
                    entry3 = entry1 + entry2 + array[c];
                    System.out.println(entry3);
                }
            }
        }
        
        
        for(int a = 0; a < array.length; a++)
        {
            
            entry1 = array[a];
            
            for(int b = 0; b < array.length; b++)
            {
                entry2 = array[b];
                
                for(int c = 0; c < array.length; c++)
                {
                    entry3 = array[c];

                    for(int d = 0; d < array.length; d++)
                    {
                        
                        entry4 = entry1 + entry2 + entry3 + array[d];
                        System.out.println(entry4);
                    }
                }
            }
            
        }
        
        
        for(int a = 0; a < array.length; a++)
        {
            
            entry1 = array[a];
            
            for(int b = 0; b < array.length; b++)
            {
                
                entry2 = array[b];
                
                for(int c = 0; c < array.length; c++)
                {
                    entry3 = array[c];

                    for(int d = 0; d < array.length; d++)
                    {
                        
                        entry4 = array[d];
                        
                        
                        for(int e = 0; e < array.length; e++)
                        {
                            
                            entry5 = entry1 + entry2 + entry3 + entry4 + array[e];
                            System.out.println(entry5);
                        }
                    }
                }
            }
            
        }
        
        
        for(int a = 0; a < array.length; a++)
        {
            
            entry1 = array[a];
            
            for(int b = 0; b < array.length; b++)
            {
                
                entry2 = array[b];
                
                for(int c = 0; c < array.length; c++)
                {
                    entry3 = array[c];

                    for(int d = 0; d < array.length; d++)
                    {
                        
                        entry4 = array[d];
                        
                        
                        for(int e = 0; e < array.length; e++)
                        {
                            
                            entry5 = array[e];
                            
                            for(int f = 0; f < array.length; f++)
                            {
                                entry6 = entry1 + entry2 + entry3 + entry4 + entry5 + array[f];
                                
                                System.out.println(entry6);
                            }
                        }
                    }
                }
            }
            
        }
        
        for(int a = 0; a < array.length; a++)
        {
            
            entry1 = array[a];
            
            for(int b = 0; b < array.length; b++)
            {
                
                entry2 = array[b];
                
                for(int c = 0; c < array.length; c++)
                {
                    entry3 = array[c];

                    for(int d = 0; d < array.length; d++)
                    {
                        
                        entry4 = array[d];
                        
                        
                        for(int e = 0; e < array.length; e++)
                        {
                            
                            entry5 = array[e];
                            
                            for(int f = 0; f < array.length; f++)
                            {
                                entry6 =  array[f];
                                
                                for(int g = 0; g < array.length; g++)
                                {
                                    entry7 = entry1 + entry2 + entry3 + entry4 + entry5 + entry6 + array[g];
                                    
                                    System.out.println(entry7);
                                }
                            }
                        }
                    }
                }
            }
            
        }
        
        for(int a = 0; a < array.length; a++)
        {
            
            entry1 = array[a];
            
            for(int b = 0; b < array.length; b++)
            {
                
                entry2 = array[b];
                
                for(int c = 0; c < array.length; c++)
                {
                    entry3 = array[c];

                    for(int d = 0; d < array.length; d++)
                    {
                        
                        entry4 = array[d];
                        
                        
                        for(int e = 0; e < array.length; e++)
                        {
                            
                            entry5 = array[e];
                            
                            for(int f = 0; f < array.length; f++)
                            {
                                entry6 =  array[f];
                                
                                for(int g = 0; g < array.length; g++)
                                {
                                    entry7 = array[g];
                                    
                                    for(int h = 0; h < array.length; h++)
                                    {
                                        
                                        entry8 = entry1 + entry2 + entry3 + entry4 + entry5 + entry6 + entry7 + array[h];
                                        
                                        System.out.println(entry8);
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