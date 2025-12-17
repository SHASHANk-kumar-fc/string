int i = text1.length();
int j = text2.length();

StringBuilder sb = new StringBuilder();

while (i > 0 && j > 0) {
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
        sb.append(text1.charAt(i - 1));
i--;
j--;
        } else if (dp[i - 1][j] > dp[i][j - 1]) {
i--;
        } else {
j--;
        }
        }

        sb.reverse();
System.out.println(sb.toString());
