sum=0
echo "How many numbers: "
read n

echo "Enter the numbers: "
for ((i=1; i<=n; i++))
do
  read num
  sum=$((sum + num))
done

echo "The sum of the numbers is: $sum"

