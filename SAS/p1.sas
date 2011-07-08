*PROBLEM 1;
*The idea is to progress two separate series forward (multiples of 3;
*and multiples of 5), and keep progressing the lower one, only adding to;
*the total the first time a number comes up;
data _null_;
    limit = 1000;
    i3 = 0;
    i5 = 0;
    total = 0;
    do while (i3 < limit or i5 < limit);
        if i3 <= i5 then do;
            i3 = i3 + 3;
            if i3 < limit and i3 ne i5 then do;
                total = total + i3;
            end;
        end;
        else do;
            i5 = i5 + 5;
            if i5 < limit and i5 ne i3 then do;
                total = total + i5;
            end;
        end;
    end;
    put total=;
run;