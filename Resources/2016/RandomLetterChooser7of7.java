//What score would you give this?


public class RandomLetterChooser
{
 
private String[] words ;
 
    public RandomLetterChooser3( String[] someWords )
    {
		words = new String[someWords.length];
		for( int i =0 ; i < someWords.length ;i++)
			words[i] = someWords[i] ; //copy values
    }
 
 
	public String getNext(){
	if( words.length ==0)
		return "NONE";
 
	int rand = (int)(Math.random() * words.length);
	
	String randomWord = words[rand];
 
	String[]  updatedWords = new String[words.length-1];
	int index=0;	
	for( int i =0 ; i < words.length ;i++)
		{
		if( i != rand) //then copy
			{
			updatedWords [index] = words[i] ; 
			index++;	
			}
		}
	words= updatedWords;
	
	return randomWord;
	}
}
