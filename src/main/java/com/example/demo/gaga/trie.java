package com.example.demo.gaga;

import com.example.demo.lintcode.Lintcode_53;
import sun.security.provider.certpath.Vertex;

/**
 * @author jiahaowei
 * @date 2019-06-13 14:37
 **/
public class trie {
}


class Trie {
    private Vertex root = new Vertex();


    private class Vertex {
        /**
         * 单词出现次数统计
         */
        int wordCount;
        /**
         * 以某个前缀开头的单词，它的出现次数
         */
        int prefixCount;
        /**
         * 子节点用数组表示
         */
        Vertex[] vertexs = new Vertex[26];

        /**
         * 树节点的构造函数
         */
        public Vertex() {
            wordCount = 0;
            prefixCount = 0;
        }

        /**
         * 向单词查找树添加一个新单词
         *
         * @param word
         *            单词
         */
        public void addWord(String word) {
            addWord(root, word.toLowerCase());
        }



        /**
         * 向单词查找树添加一个新单词
         *
         * @param root
         *            单词查找树节点
         * @param word
         *            单词
         */
        private void addWord(Vertex vertex, String word) {
            if (word.length() == 0) {
                vertex.wordCount++;
            } else if (word.length() > 0) {
                vertex.prefixCount++;
                char c = word.charAt(0);
                int index = c - 'a';
                if (null == vertex.vertexs[index]) {
                    vertex.vertexs[index] = new Vertex();
                }
                addWord(vertex.vertexs[index], word.substring(1));
            }
        }

    }



    /**
     * 单词查找树构造函数
     */
    public Trie() {
    }


}