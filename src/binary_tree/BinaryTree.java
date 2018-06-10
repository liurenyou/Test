package binary_tree;

public class BinaryTree {
	private Node root = null;

	BinaryTree(int value) {
		root = new Node(value);
		root.leftChild = null;
		root.rightChild = null;
	}

	// 查找数据
	public Node findKey(int value) {
		Node current = root;
		while (true) {
			if (value == current.value) {
				return current;
			} else if (value < current.value) {
				current = current.leftChild;
			} else if (value > current.value) {
				current = current.rightChild;
			}
			if (current == null) {
				return null;
			}
		}
	}

	// 插入数据
	public String insert(int value) {
		String error = null;
		
		Node node = new Node(value);
		if(root == null) {
			root = node;
			root.leftChild = null;
			root.rightChild = null;
		} else {
			Node current = root;
			Node parent = null;
			while(true) {
				if(value < current.value) {
					parent = current;
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = node;
						break;
					}
				} else if(value > current.value) {
					parent = current;
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = node;
						break;
					}
				} else {
					error = "having same value in binary tree";
				}
			}
		}
		return error;
	}

	/*
	 *  中序遍历递归操作：
	 *  1.调用自身来遍历节点的左子树
	 *  2.访问这个节点
	 *  3.调用自身来遍历节点的右子树
	 */
	public void inOrderTraverse() {
		System.out.println("中序遍历");
		inOrderTraverse(root);
		System.out.println();
	}
	private void inOrderTraverse(Node node) {
		if(node == null)
			return;
		
		inOrderTraverse(node.leftChild);
		node.display();
		inOrderTraverse(node.rightChild);
	}

	// 中序遍历非递归操作
	public void inOrderByStack() {
	}

	// 前序遍历
	public void preOrderTraverse() {
	}

	// 前序遍历非递归操作
	public void preOrderByStack() {
	}

	// 后续遍历
	public void postOrderTraverse() {
	}

	// 后续遍历非递归操作
	public void postOrderByStack() {
	}

	// 得到最大值
	public int getMaxValue() {
		return 0;
	}

	// 得到最小值
	public int getMinVlaue() {
		return 0;
	}

	// 删除
	public boolean delete(int value) {
		return false;

	}

}
