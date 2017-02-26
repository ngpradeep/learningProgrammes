package com.sort.tests;

public class link {

	public String booksname ;
	public int bookssold;
	public link next;
	public link (String booksname,int bookssold ){
		this.booksname = booksname;
		this.bookssold = bookssold;
		
		
	}
	
	public void display(){
		System.out.println(booksname +":"+bookssold);
	}
	
	public String  toString(){
		return this.booksname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linklist thelinklist = new linklist();
		thelinklist.insertFirstlink("Java Advanced", 400);
		thelinklist.insertFirstlink("Oracle Advanced", 400);
		thelinklist.insertFirstlink(".net advanced", 900);
		thelinklist.insertFirstlink("Java programming interview exposed", 2000);
		
		thelinklist.displayeverything();
		System.out.println("Bookname found"+thelinklist.toFindBookname(".net advanced"));
		thelinklist.removeLink("Oracle Advanced");
		System.out.println("Bookname not  found"+thelinklist.toFindBookname(".net advanced"));
		thelinklist.displayeverything();
		
	}

}

class linklist{
     public link firstlink;
     
     linklist(){
    	 firstlink = null;
     }
	
	 public boolean isempty(){
       if (firstlink == null){
    	   return true;
       }
       return false;
	 }
	 
	 
	 public void insertFirstlink (String booksname,int bookssold){
		 link newLink = new link(booksname,bookssold);
		 newLink.next = firstlink;
		 firstlink = newLink;
	 }
	 
	 
	 public link removeFirst(){
		 link linkRefrence = firstlink;
		 if (!isempty()){
		 firstlink = firstlink.next;
		 }else {
			 System.out.println("LinkList is empty");
		 }
		 return linkRefrence;
	 }
	 
	 public void displayeverything(){
		 link thelink = firstlink;
		 
		 
		 while(thelink !=null){
			 thelink.display();
			 System.out.println("Next Link" + thelink.next);
			 thelink = thelink.next;	 
		 }
		 
		 
	 }
	 
	 public link toFindBookname(String booksname){
		 link thelink = firstlink;
		 if(!isempty()){
			 while(thelink.booksname != booksname){
				 if(thelink.next ==null){
					 return null;
				 }else {
					 thelink = thelink.next;
					 
				 }
			 }	 
			 }else {
				 System.out.println("empty linklist");
			 }
		return thelink;
		 }
	   
	 
	 public link removeLink (String booksname){
		 link currentlink =firstlink;
		 link previouslink = firstlink;
		 int i=0;
		 int j=0;
		while (currentlink.booksname != booksname){
			if (currentlink.next == null){
				System.out.println("no next item");
				return null;	
			}else
			{
				previouslink = currentlink;
				currentlink =  currentlink.next;
				
			}
			j=j+1;
			
		}
		System.out.println("number of count "+j);
		
		if (currentlink == firstlink){
			firstlink = currentlink.next;
		}else {
			previouslink.next = currentlink.next;
		}
		
		 return currentlink;
	 }
		 
	 
	}

