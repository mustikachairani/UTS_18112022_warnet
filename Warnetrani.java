/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_18112022_A;

import java.time.Duration;

/**
 *
 * @author user
 */
public class Warnetrani {
    private int code; 
        private String customername; 
        private String customertype; 
        private String entrydate; 
        private String entrytime; 
        private String timeout;
        private String duration;
        private double price;
        
     
        
        private static int warnetCount;
           
        public int getCode(){ 
            return code; 
        } 
        
        public void setCode( int code ){ 
             this.code = code; 
        } 

        public String getCustomername(){ 
            return customername; 
        } 
        
        public void setCustomername( String customername ){ 
             this. customername = customername; 
        } 
        
        public String getCustomertype(){ 
            return customertype; 
        } 
        
        public void setCustomertype( String customertype ){ 
             this. customertype = customertype; 
        } 
        
        public String getEntrydate(){ 
            return entrydate; 
        } 
        
        public void setEntrydate( String entrydate ){ 
             this. entrydate = entrydate; 
        } 
        
        public String getEntrytime(){ 
            return entrytime; 
        } 
        
        public void setEntrytime( String entrytime ){ 
             this. entrytime = entrytime; 
        } 
        
        public String getTimeout(){ 
            return entrytime; 
        } 
        
        public void setTimeout( String timeout ){ 
             this. timeout = timeout; 
        } 
        
         public double getPrice(){ 
            return price; 
        } 
        
        public void setPrice( double Price ){ 
             this. price = price; 
        } 
        
        
        public String getDuration() { 
            duration = ( timeout - entrytime);
            return duration;
        }
        public void setDuration( String tduration ){ 
             this. duration = duration; 
        } 
        
}
