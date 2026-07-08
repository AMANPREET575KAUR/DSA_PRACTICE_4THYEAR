package DAY2;

class listnode {
    int val;
    listnode next;
    listnode() {}
    listnode(int val) {
        this.val = val;
    }
    listnode(int val, listnode next) {
        this.val = val;
        this.next = next;
    }
}
public class SUM_OF_TWO_NODES_LL {
    public listnode addsum(listnode l1, listnode l2) {
        listnode dummy = new listnode(0);
        listnode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new listnode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }


    public static void printList(listnode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {


        listnode l1 = new listnode(2);
        l1.next = new listnode(4);
        l1.next.next = new listnode(3);


        listnode l2 = new listnode(5);
        l2.next = new listnode(6);
        l2.next.next = new listnode(4);

        SUM_OF_TWO_NODES_LL obj = new SUM_OF_TWO_NODES_LL();

        listnode result = obj.addsum(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}