  /**
     * find/return a pair for the single character string ch
     * precondition ch.length() == 1; ch is a single character string
     * @return the coordinates of ch in the encryption matrix
     */
    private Point getCoordinates(String ch)
    {
	int j, k;
	for(j=0; j < SIZE; j++)
	{
	    for(k=0; k < SIZE; k++)
	    {
		if (myMatrix[j][k].equals(ch))
		{
		    return new Point(j,k);
		}
	    }
	}
	return new Point(-1, -1);  // should never reach this
    }


