
private void traverseUnorderedTree(Node v, Node w){
		
		/* p is number of children of v 
		 * q is number of children of w
		 */
		int p  = v.getOutgoingEdgeList().size();
		int q = w.getOutgoingEdgeList().size();

		/* v is a leaf*/
		if(p == 0){
			return 1;
		}		
		/* w is a leaf*/
		if(q == 0){
			return 1;
		}

		ListOfEdges outList1 = v.getOutgoingEdgeList();
		ListOfEdges outList2 = w.getOutgoingEdgeList();
		
		/*Create a Cartesian Product */
		for(int i = 0; i < p; i++){
			for(int j = 0; j < q; j++){
				Node childNode1 = outList1.getEdge(i).getTargetNode();
				Node childNode1 = outList2.getEdge(j).getTargetNode();
				
				/*if content of node is different mark both as umnatched, i.e not found */
				if(childNode1.getContent() == childNode1.getContent()){
					if( !childNode1.getLock() && !childNode2.getLock()){
						childNode1.matched(true);
						childNode1.lock();
						
						childNode2.matched(true);
						childNode2.lock();
						
						putIntoMappedList(childNode1, childNode2);
					}
				} 
				
				traverseUnorderedTree(childNode1, childNode2);
			}
		}
	}