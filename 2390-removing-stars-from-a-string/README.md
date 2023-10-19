<h2><a href="https://leetcode.com/problems/removing-stars-from-a-string/">2390. Removing Stars From a String</a></h2><h3>Medium</h3><hr><div><p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Y</span>ou</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">a</span>re</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">g</span>iven</span> a <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">st</span>ring</span> </span><code>s</code><span class="extension-adhd-reader-wrapper">, <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">w</span>hich</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">co</span>ntains</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">s</span>tars</span> </span><code>*</code>.</p>

<p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper">In <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">o</span>ne</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">ope</span>ration,</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">y</span>ou</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">c</span>an:</span></span></p>

<ul>
	<li>Choose a star in <code>s</code>.</li>
	<li>Remove the closest <strong>non-star</strong> character to its <strong>left</strong>, as well as remove the star itself.</li>
</ul>

<p class="extension-adhd-reader-p"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Re</span>turn</span> </span><em><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">t</span>he</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">st</span>ring</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">a</span>fter</span> </span><strong><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">a</span>ll</span></span></strong><span class="extension-adhd-reader-wrapper"> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">s</span>tars</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">h</span>ave</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">b</span>een</span> <span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">re</span>moved</span></span></em>.</p>

<p class="extension-adhd-reader-p"><strong><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">N</span>ote:</span></span></strong></p>

<ul>
	<li>The input will be generated such that the operation is always possible.</li>
	<li>It can be shown that the resulting string will always be unique.</li>
</ul>

<p class="extension-adhd-reader-p">&nbsp;</p>
<p class="extension-adhd-reader-p"><strong class="example"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Ex</span>ample</span> 1:</span></strong></p>

<pre><strong>Input:</strong> s = "leet**cod*e"
<strong>Output:</strong> "lecoe"
<strong>Explanation:</strong> Performing the removals from left to right:
- The closest character to the 1<sup>st</sup> star is 't' in "lee<strong><u>t</u></strong>**cod*e". s becomes "lee*cod*e".
- The closest character to the 2<sup>nd</sup> star is 'e' in "le<strong><u>e</u></strong>*cod*e". s becomes "lecod*e".
- The closest character to the 3<sup>rd</sup> star is 'd' in "leco<strong><u>d</u></strong>*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".</pre>

<p class="extension-adhd-reader-p"><strong class="example"><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Ex</span>ample</span> 2:</span></strong></p>

<pre><strong>Input:</strong> s = "erase*****"
<strong>Output:</strong> ""
<strong>Explanation:</strong> The entire string is removed, so we return an empty string.
</pre>

<p class="extension-adhd-reader-p">&nbsp;</p>
<p class="extension-adhd-reader-p"><strong><span class="extension-adhd-reader-wrapper"><span class="extension-adhd-reader-container"><span class="extension-adhd-reader-boldify">Cons</span>traints:</span></span></strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters and stars <code>*</code>.</li>
	<li>The operation above can be performed on <code>s</code>.</li>
</ul>
</div>