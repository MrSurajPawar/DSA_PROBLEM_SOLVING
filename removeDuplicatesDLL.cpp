Node * removeDuplicates(Node *head)

    Node* temp = head;

    while (temp != nullptr && temp->next != nullptr) {
        Node* nextNode = temp->next;
        while (nextNode != nullptr && nextNode->data == temp->data ) {
            Node* duplicates = nextNode;
            nextNode = nextNode->next;
            free(duplicates);
        }
        temp->next = nextNode;  
        if (nextNode != nullptr)   nextNode->prev = temp;

        temp = temp->next;       
    }

    return head;
}
