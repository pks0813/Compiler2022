
define dso_local i32 @main() #4 {
entry:
  %0 = alloca [10 x i32]
  %1 =bitcast [10 x i32]* %0 to i32**
  %2 = getelementptr inbounds i32*, i32** %1, i32 0
  store i32* %2 i32 10
  %3 = load i32 i32* %2

  ret i32 0
}
