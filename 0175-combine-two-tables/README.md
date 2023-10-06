<h2><a href="https://leetcode.com/problems/combine-two-tables/">175. Combine Two Tables</a></h2><h3>Easy</h3><hr><div class="sql-schema-wrapper__3VBi"><a class="sql-schema-link__3cEg">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg></a></div><div><p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Ta</span>ble:</span> </span><code><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Pe</span>rson</span></span></code></p>

<pre>+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| personId    | int     |
| lastName    | varchar |
| firstName   | varchar |
+-------------+---------+
personId is the primary key (column with unique values) for this table.
This table contains information about the ID of some persons and their first and last names.
</pre>

<p class="extension-adhd-reader-p">&nbsp;</p>

<p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Ta</span>ble:</span> </span><code><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Ad</span>dress</span></span></code></p>

<pre>+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| addressId   | int     |
| personId    | int     |
| city        | varchar |
| state       | varchar |
+-------------+---------+
addressId is the primary key (column with unique values) for this table.
Each row of this table contains information about the city and state of one person with ID = PersonId.
</pre>

<p class="extension-adhd-reader-p">&nbsp;</p>

<p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">W</span>rite</span> a <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">so</span>lution</span> to <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">re</span>port</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>he</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">f</span>irst</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">n</span>ame,</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">l</span>ast</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">n</span>ame,</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">c</span>ity,</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">a</span>nd</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">s</span>tate</span> of <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">e</span>ach</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">pe</span>rson</span> in <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>he</span> </span><code><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Pe</span>rson</span></span></code><span class="extension-adhd-reader-wrapper"> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">ta</span>ble.</span> If <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>he</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">ad</span>dress</span> of a </span><code><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">pe</span>rsonId</span></span></code><span class="extension-adhd-reader-wrapper"> is <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">n</span>ot</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">pr</span>esent</span> in <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>he</span> </span><code><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Ad</span>dress</span></span></code><span class="extension-adhd-reader-wrapper"> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">ta</span>ble,</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">re</span>port</span> </span><code><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">n</span>ull</span></span></code><span class="extension-adhd-reader-wrapper"> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">in</span>stead.</span></span></p>

<p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Re</span>turn</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>he</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">re</span>sult</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>able</span> in </span><strong><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">a</span>ny</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">o</span>rder</span></span></strong>.</p>

<p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">T</span>he</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">re</span>sult</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">fo</span>rmat</span> is in <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>he</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">fol</span>lowing</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">ex</span>ample.</span></span></p>

<p class="extension-adhd-reader-p">&nbsp;</p>
<p class="extension-adhd-reader-p"><strong class="example"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Ex</span>ample</span> 1:</span></strong></p>

<pre><strong>Input:</strong> 
Person table:
+----------+----------+-----------+
| personId | lastName | firstName |
+----------+----------+-----------+
| 1        | Wang     | Allen     |
| 2        | Alice    | Bob       |
+----------+----------+-----------+
Address table:
+-----------+----------+---------------+------------+
| addressId | personId | city          | state      |
+-----------+----------+---------------+------------+
| 1         | 2        | New York City | New York   |
| 2         | 3        | Leetcode      | California |
+-----------+----------+---------------+------------+
<strong>Output:</strong> 
+-----------+----------+---------------+----------+
| firstName | lastName | city          | state    |
+-----------+----------+---------------+----------+
| Allen     | Wang     | Null          | Null     |
| Bob       | Alice    | New York City | New York |
+-----------+----------+---------------+----------+
<strong>Explanation:</strong> 
There is no address in the address table for the personId = 1 so we return null in their city and state.
addressId = 1 contains information about the address of personId = 2.
</pre>
</div>