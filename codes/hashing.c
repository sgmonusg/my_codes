#include<stdio.h>
struct HashNode{
	HashNode *next;
};

typedef struct HashNode HashNode;


struct LinkNode{
	int data;
	struct LinkNode *next;
	struct LinkNode *prev;
};
typedef struct LinkNode LinkNode;

LinkNode * createLinkNode(int data){
	LinkNode *node=(LinkNode *)malloc(sizeof(LinkNode));
	node->data=data;
	node->next=NULL;
	node->prev=NULL;
	return node;
}

void insertIntoHashTable(HashNode **table, LinkNode **node){

	if(table->next==NULL){
		*table->next=*node;
		*tail=*node;
		*head=*node;
	}
	else{
		while(table->next!==NULL){
			*tail->next=*node;
			*node->prev=*tail;
			*tail=*node;
		}
	}
}

int main(){
	HashNode arr[10];

	
}