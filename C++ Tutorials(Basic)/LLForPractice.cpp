#include <iostream>
using namespace std;

// Node structure
struct Node {
    int data;
    Node* next;
};

// Function to insert a node at the front of the linked list
void insertAtFront(Node*& head, int data) {
    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = head;
    head = newNode;
}

// Function to display all nodes
void displayList(Node* head) {
    if (head == nullptr) {
        cout << "The list is empty." << endl;
        return;
    }

    Node* temp = head;
    while (temp != nullptr) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

// Function to delete the first node of the linked list
void deleteFirstNode(Node*& head) {
    if (head == nullptr) {
        cout << "The list is already empty." << endl;
        return;
    }

    Node* temp = head;
    head = head->next;
    delete temp;
}

// Function to insert a node at the end of the linked list
void insertAtEnd(Node*& head, int data) {
    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = nullptr;

    if (head == nullptr) {
        head = newNode;
        return;
    }

    Node* temp = head;
    while (temp->next != nullptr) {
        temp = temp->next;
    }

    temp->next = newNode;
}

// Function to delete the last node of the linked list
void deleteLastNode(Node*& head) {
    if (head == nullptr) {
        cout << "The list is already empty." << endl;
        return;
    }

    if (head->next == nullptr) {
        delete head;
        head = nullptr;
        return;
    }

    Node* temp = head;
    while (temp->next->next != nullptr) {
        temp = temp->next;
    }

    delete temp->next;
    temp->next = nullptr;
}

// Function to delete a node from a specified position
void deleteNodeAtPosition(Node*& head, int position) {
    if (head == nullptr) {
        cout << "The list is empty." << endl;
        return;
    }

    if (position == 1) {
        Node* temp = head;
        head = head->next;
        delete temp;
        return;
    }

    Node* temp = head;
    for (int i = 1; temp != nullptr && i < position - 1; i++) {
        temp = temp->next;
    }

    if (temp == nullptr || temp->next == nullptr) {
        cout << "Position is out of range." << endl;
        return;
    }

    Node* nextNode = temp->next->next;
    delete temp->next;
    temp->next = nextNode;
}

int main() {
    Node* head = nullptr;
    int choice, data, position;

    do {
        cout << "\nMenu:\n";
        cout << "1. Insert a node at the front\n";
        cout << "2. Display all nodes\n";
        cout << "3. Delete the first node\n";
        cout << "4. Insert a node at the end\n";
        cout << "5. Delete the last node\n";
        cout << "6. Delete a node from specified position\n";
        cout << "7. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter the value to insert at the front: ";
                cin >> data;
                insertAtFront(head, data);
                break;

            case 2:
                displayList(head);
                break;

            case 3:
                deleteFirstNode(head);
                break;

            case 4:
                cout << "Enter the value to insert at the end: ";
                cin >> data;
                insertAtEnd(head, data);
                break;

            case 5:
                deleteLastNode(head);
                break;

            case 6:
                cout << "Enter the position to delete: ";
                cin >> position;
                deleteNodeAtPosition(head, position);
                break;

            case 7:
                cout << "Exiting..." << endl;
                break;

            default:
                cout << "Invalid choice! Please choose again." << endl;
                break;
        }
    } while (choice != 7);

    return 0;
}
