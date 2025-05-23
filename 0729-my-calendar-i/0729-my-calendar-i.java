class MyCalendar {
         private List<int[]> books = new ArrayList<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] i: books){
            if(Math.max(i[0], startTime)<Math.min(i[1], endTime)) return false;
        }
         
            books.add(new int[]{startTime, endTime});
            return true;
        
     
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */