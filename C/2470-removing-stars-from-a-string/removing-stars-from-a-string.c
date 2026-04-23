struct stack {
    int top;
    int size;
    char *arr;
};

// Push
void push(struct stack *s, char value) {
    if (s->top < s->size - 1) {
        s->arr[++s->top] = value;
    }
}

// Pop
void pop(struct stack *s) {
    if (s->top >= 0) {
        s->top--;
    }
}

char* removeStars(char* str) {
    int n = strlen(str);

    struct stack s;
    s.size = n;
    s.top = -1;
    s.arr = (char*)malloc(n * sizeof(char));

    for (int i = 0; i < n; i++) {
        if (str[i] == '*') {
            pop(&s);
        } else {
            push(&s, str[i]);
        }
    }

    char *result = (char*)malloc((s.top + 2) * sizeof(char));

    int i;
    for (i = 0; i <= s.top; i++) {
        result[i] = s.arr[i];
    }
    result[i] = '\0';
    
    return result;
}