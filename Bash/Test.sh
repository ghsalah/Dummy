line_count=0
word_cound=0
while a= read -r line;
do
line_count=$((line_count+1))
for word in $line;
do
word_count=$((word_count+1))
done
done < $1
echo "word:$word_count"
echo "line:$line_count"
