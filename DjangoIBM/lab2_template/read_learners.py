# Your code starts from here:
 # Find students with last name "Smith"
try:
    learners_smith = Learner.objects.filter(last_name="Smith")
    print("1. Find learners with last name `Smith`")
    print(learners_smith)
except Learner.DoesNotExist:
    print("error 1")
print("\n")
# Order by dob descending, and select the first two objects
learners = Learner.objects.order_by('-dob')[0:2]
print("2. Find top two youngest learners")
print(learners)
