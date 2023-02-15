package inserAtfistofDLL;
class  node{
	int data ;
	node next;
	node prev;
	node(int data){
		this.data=data;
		next = null;
		prev = null;
	}
}



public class susobhan {
	public static void main(String args[]) {
		node head = new node(90);
		node temp1 = new node(80);
		node temp2 = new node(70);
		head.next= temp1;
		temp1.prev= head;
		temp1.next= temp2;
		temp2.prev= temp1;
		temp2.next= null;
		head  = insertnode(head,44);
		printnode(head);
		
	}
	
	static node insertnode(node head,int data) {
		node newnode = new node(data);         //CREATE NEW NODE 
		newnode.next= head;                   //GIVE CONNECTION
     	newnode.prev= null;
		if(head!=null) {
			newnode.next= head;
			head= newnode;
			}
			
		return head;
		
		
	}
	
	static void printnode(node head) {
		node curr = head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr= curr.next;
		}
	}

}
