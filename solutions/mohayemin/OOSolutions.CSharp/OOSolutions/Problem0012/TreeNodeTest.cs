using Xunit;

namespace OOSolutions.Problem0012
{
    public class TreeNodeTest
    {
        [Fact]
        void Leaf()
        {
            var node = new TreeNode(12);
            Assert.Equal(12, node.GetValue());
        }

        [Fact]
        void NonLeaf()
        {
            var node1 = new TreeNode(12);
            var node2 = new TreeNode(13);
            var node3 = new TreeNode();
            node3
                .AddChild(node1)
                .AddChild(node2);

            Assert.Equal(25, node3.GetValue());
        }
    }
}
