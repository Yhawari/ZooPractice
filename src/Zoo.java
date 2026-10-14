
public class Zoo {
	    private Animals[] animals;
	    
	    public Zoo(String setOfAnimals){
	        String[] animalSet = setOfAnimals.split(" - ");
	        animals = new Animals[animalSet.length];
	        
	        for(int i = 0; i < animals.length; i ++){
	            String []animalS = animalSet[i].split(" ");
	            String type = animalS[0];
	            String color = animalS[1];
	            int age = Integer.parseInt(animalS[2]);
	            
	            animals[i] = new Animals(type, color, age);
	        }
	        
	    }
	    public Animals[] getAnimals(){
	            return animals;
	    }
	    public int CountCat(){
	        int count = 0 ;
	        for( int i = 0; i < animals.length;i++)
	            if (animals[i].getType().equals("cat"))
	                count ++;
	        return count;       
	    }
	    
	    public int CountBirds(){
	        int count = 0 ;
	        for( int i = 0; i < animals.length;i++)
	            if (animals[i].getType().equals("bird"))
	                count ++;
	        return count;       
	    }
	        
	    public int countYoung(){
	        int count = 0 ;
	        for( int i = 0; i < animals.length;i++)
	            if (animals[i].isYoung())
	                count ++;
	        return count;   
	    }

	    @Override
	    public String toString() {
	        int birds = CountBirds();
	        int cats = CountCat();
	        return "the zoo contains " + cats + " cats and " + birds + " birsd.";
	    }
	    
	            
	
}
