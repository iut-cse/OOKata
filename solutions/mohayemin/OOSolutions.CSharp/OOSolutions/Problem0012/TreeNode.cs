using System.Collections.Generic;
using System.Linq;

namespace OOSolutions.Problem0012
{
    class TreeNode
    {
        private readonly double? value;
        private readonly List<TreeNode> children;
        private TreeNode parent;

        public TreeNode(double? value = null)
        {
            this.value = value;
            children = new List<TreeNode>();
        }

        public double? GetValue()
        {
            if (children.Count != 0)
                return children.Sum(child => child.GetValue());
            else
                return value;
        }

        public TreeNode AddChild(TreeNode child)
        {
            if (child.parent != null)
                child.parent.children.Remove(child);

            child.parent = this;
            children.Add(child);

            return this;
        }
    }
}
