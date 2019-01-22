
// 13.2 - Angela Bonsol

public class MagazineList {
	private MagazineNode list;

	// ----------------------------------------------------------------
	// Sets up an initially empty list of magazines.
	// ----------------------------------------------------------------
	public MagazineList() {
		list = null;
	}

	// ----------------------------------------------------------------
	// Creates a new MagazineNode object and adds it to the end of
	// the linked list.
	// ----------------------------------------------------------------
	public void add(Magazine mag) {
		MagazineNode node = new MagazineNode(mag);
		MagazineNode current;

		if (list == null)
			list = node;
		else {
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node;
		}
	}

	// Insert Method 
	public void insert(Magazine title) {
		MagazineNode node = new MagazineNode(title);

		if (list == null) {
			list = node;
		} 
		else {
			MagazineNode before = null;
			MagazineNode current = list;

			while (current != null && current.magazine.toString().compareTo(title.toString()) < 0) {
				before = current;
				current = current.next;
		}
			
		if (before == null) {
				before = node;
				before.next = list;
				list = before;
		} 
		else {
				before.next = node;
				node.next = current;
		}
		
		}
	}

	//Delete Method 
	public void delete(String magazine) {
		MagazineNode before = list;
		MagazineNode current = before.next;

		if (before.magazine.toString() == magazine) {
			list = before.next;
		} 
		else {
			
			while (current != null) {
				if (current.magazine.toString() == magazine) {
					before.next = current.next;
					current = null;
				} 
				else {
					before = before.next;
					current = current.next;
				}
			}
		}
	}

    //----------------------------------------------------------------
    //  Returns this list of magazines as a string.
    //----------------------------------------------------------------
    public String toString()
    {
        String result = "";

        MagazineNode current = list;

        while (current != null)
        {
            result += current.magazine + "\n";
            current = current.next;
        }fedd

        return result;
    }

    //*****************************************************************
    //  An inner class that represents a node in the magazine list.
    //  The public variables are accessed by the MagazineList class.
    //*****************************************************************
    private class MagazineNode
    {
        public Magazine magazine;
        public MagazineNode next;

        //--------------------------------------------------------------
        //  Sets up the node
        //--------------------------------------------------------------
        public MagazineNode(Magazine mag)
        {
            magazine = mag;
            next = null;
        }
    }
}
