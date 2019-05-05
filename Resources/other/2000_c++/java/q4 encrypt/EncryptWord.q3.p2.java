  /**
     * Encrypt a two-character string.
     * precondition pair.length() == 1; pair has two characters
     * @param pair is the string encrypted
     * @return an encrypted form of pair
     */
    
    private String encryptTwo(String pair)
    {
	String c1 = pair.substring(0,1);
	String c2 = pair.substring(1,2);
	
	Point p1 = getCoordinates(c1);
	Point p2 = getCoordinates(c2);

	if (p1.getRow() == p2.getRow() ||
	    p1.getColumn() == p2.getColumn())
	{
	    return new String(c2 + c1);
	}
	else
	{
	    return new String(myMatrix[p1.getRow()][p2.getRow()] +
			      myMatrix[p2.getColumn()][p1.getColumn()]);
	}
    }
