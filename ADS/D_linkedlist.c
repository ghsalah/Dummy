#include <stdio.h>

struct Node {
    struct Node* prev;
    int data;
    struct Node* next;
};

// Global head node
struct Node* myNode;

void main() {
    myNode = malloc(sizeof(struct Node));
    myNode->prev = NULL;
    myNode->next = NULL;

    int choice;
    int stop = 1;

    while (stop != 0) {
        printf("\n1. Add\n2. Delete\n3. Show\n4. End");
        printf("\nEnter the choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                int newData;
                printf("Enter data to add: ");
                scanf("%d", &newData);

                struct Node* newNode = malloc(sizeof(struct Node));
                newNode->data = newData;
                newNode->next = NULL;
                newNode->prev = myNode;

                if (myNode->next != NULL) {
                    newNode->next = myNode->next;
                    myNode->next->prev = newNode;
                }

                myNode->next = newNode;
                break;
            }
            case 2:
                if (myNode->next != NULL) {
                    struct Node* nextNode = myNode->next;
                    myNode->next = nextNode->next;

                    if (nextNode->next != NULL) {
                        nextNode->next->prev = myNode;
                    }

                    free(nextNode);
                } else {
                    printf("No node, it's Empty.\n");
                }
                break;

            case 3: {
                struct Node* current = myNode->next;  // Start from the first node

                printf("NULL -> ");
                while (current != NULL) {
                    printf("%d -> ", current->data);
                    current = current->next;
                }
                printf("NULL\n");
                break;
            }

            case 4:
                stop = 0; 
                break;
            default:
                printf("Invalid choice\n");
        }
    }

    
}
    
