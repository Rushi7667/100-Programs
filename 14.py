# WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).

def angle_of_wacthhands(h,m):
    hour_hand = h 
    minute_hand = m

    Degree_of_hour = (360//12)*hour_hand + (360//(60*12))*minute_hand
    Degree_of_minute = (360/60) * minute_hand

    angle = abs(Degree_of_hour - Degree_of_minute)

    if angle>180:
        angle = 360-angle

    print(angle)

h = int(input("Enter hour : "))
m = int(input("Enter minute : "))

angle_of_wacthhands(h,m)