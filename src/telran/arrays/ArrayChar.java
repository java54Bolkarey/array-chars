package telran.arrays;

public class ArrayChar {
	   private char[] array;
	   
	   public ArrayChar(char[] array) {
	       this.array = array;
	   }
	   
	  
	   public ArrayChar() {
	     
	       this.array = new char[0];
	   }

	   public int compareTo(ArrayChar another) {
	       int length = Math.min(this.array.length, another.array.length);
	       int index = 0;
	       while(index < length && this.array[index] == another.array[index]) {
	    	   index++;
	       }
	       return index == length ? this.array.length - another.array.length : 
	    	   this.array[index] - another.array[index];
	   }
	   public int indexOf(char character) {
		   int index = 0;
		   while(index < array.length && array[index] != character) {
			   index++;
		   }
           return index == array.length ? -1 : index;
	   }
	   
	   public int lastIndexOf(char character) {
		    int index = array.length - 1; // начинаем с последнего элемента
		    while (index > -1 && array[index] != character) {
		        index--; // д
		    }
		    return index == -1 ? -1 : index; // возвращаем найденный индекс или -1, если символ не найден
		}
	   
	   
	   // Возвращает количество заходов символа в массив
	   public int count(char character) {
	   int count = 0;
	   for(char c : this.array) {
	   if(c == character) {
	   count++;
	   }
	   }
	   return count;
	   }
	   
	// Сравн два массива без учета регистра
	   public int compareToIgnoreCase(ArrayChar another) {
	   int length = Math.min(this.array.length, another.array.length);
	   int index = 0;
	   while(index < length && Character.toLowerCase(this.array[index]) == Character.toLowerCase(another.array[index])) {
	   index++;
	   }
	   return index == length ? this.array.length - another.array.length : 
	   Character.toLowerCase(this.array[index]) - Character.toLowerCase(another.array[index]);
	   }

	 


	   public boolean contains(char character) {
	   return this.indexOf(character) != -1;
	   }

	   
//	   public boolean equals(ArrayChar another) {
//		
//		    if (this.array.length != another.array.length) {
//		        return false;
//		    }
//		    
//		    for (int i = 0; i < this.array.length; i++) {
//		        if (this.array[i] != another.array[i]) {
//		            return false;
//		        }
//		    }
//		
//		    return true;
//		}
	   public boolean equals(ArrayChar another) {
	   return this.compareTo(another) == 0;
	   }

//	   public boolean equalsIgnoreCase(ArrayChar another) {
//		    if (this.array.length != another.array.length) {
//		        return false;
//		    }
//
//		    for (int i = 0; i < this.array.length; i++) {
//
//		        if (Character.toLowerCase(this.array[i]) != Character.toLowerCase(another.array[i])) {
//		            return false;
//		        }
//		    }
//	
//		    return true;
//		}

	   public boolean equalsIgnoreCase(ArrayChar another) {
	   return this.compareToIgnoreCase(another) == 0;
	   }
	   

	}
