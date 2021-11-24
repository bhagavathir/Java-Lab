public class Time extends Exception{       
    int seconds;       
    int minutes;    
    int hours;         
    public Time(){            
        seconds = 0;      
        minutes = 0;        
        hours = 0;        
    }          
    public Time(int seconds, int minutes, int hours){       
        this.seconds=seconds; 
        this.minutes=minutes;        
        this.hours=hours;      
    }   
    public void setSeconds(int s){
        if(s>=0 && s<=59)
            this.seconds=s;
        else{
            throw new IllegalArgumentException("Wrong time");
        }
    }
    public void setMinutes(int m){
        if(m>=0 && m<=59)
            this.minutes=m;
        else
            throw new IllegalArgumentException("Wrong time");
    }
    public void setHours(int h){
        if(h>=0 && h<24)
            this.hours=h;
        else{
            throw new IllegalArgumentException("Wrong time");
        }
    }
    public String display(int num){               
        if(num == 1){             
            return hours%24+":"+minutes+":"+seconds;         
        }      
        else              
            return hours%12+":"+minutes+":"+seconds;         
    }
    public String toString(){               
        return "Hour: "+hours+" Minutes : "+minutes+" Seconds : "+seconds;      
    }   
}
