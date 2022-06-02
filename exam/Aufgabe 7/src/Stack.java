public class Stack {
    IntegerStack stack = new IntegerStack();
stack.push(4);
// 4
stack.push(2);
// 2 4
stack.push(0);
// 0 2 4
stack.pop();
// 2 4
stack.push(1);
// 1 2 4
stack.pop();
// 2 4
stack.pop();
// 4
stack.push(1);
// 1 4
}
