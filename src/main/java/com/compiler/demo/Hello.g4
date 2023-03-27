grammar Hello;  // 定义文法的名字

s : 'hello' ID; //匹配关键词hello和标志符
ID : [a-z]+;   //标志符由小写字符组成
WS : [ \t\r\n]+ -> skip ; //忽略空白符
