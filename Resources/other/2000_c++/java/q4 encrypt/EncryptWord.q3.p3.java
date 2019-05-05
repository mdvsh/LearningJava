/**
     * Converts a string to an encrypted form.
     * @param word is encrypted
     * @return an encrypted form of word
     */
    
    public String encryptWord(String word)
    {
	String s = "";
	int k;
	int len = word.length();
	for(k=0; k < len - 1; k += 2)
	{
	    s += encryptTwo(word.substring(k,k+2));
	}
	
	if (k == len - 1)
	{
	    s += word.substring(len-1,len);
	}
	return s;
    }
