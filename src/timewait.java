public class timewait {
          public static void main(String[] args) {
              int[] itemsPerPerson = {20, 5, 6, 25, 4, 4};
              int cashierTimeFiveOrMoreItems = 7;
              int cashierTimeLessThanFiveItems = 2;
      
              int[] individualTimes = calculateIndividualTimes(itemsPerPerson, cashierTimeLessThanFiveItems, cashierTimeFiveOrMoreItems);
              for (int i = 0; i < individualTimes.length; i++) {
                  System.out.println("Person " + (i + 1) + " time: " + individualTimes[i] + " min");
              }
          }
      
          private static int[] calculateIndividualTimes(int[] itemsPerPerson, int cashierTimeLessThanFiveItems, int cashierTimeFiveOrMoreItems) {
              int[] individualTimes = new int[itemsPerPerson.length];
              int totalTime = 0;
              int currentItems = 0;
      
              for (int i = 0; i < itemsPerPerson.length; i++) {
                  int items = itemsPerPerson[i];
      
                  int time = (currentItems + items <= 5) ? items * cashierTimeLessThanFiveItems : items * cashierTimeFiveOrMoreItems;
      
                  totalTime += time;
                  individualTimes[i] = totalTime;
      
                  if (currentItems >= 20) {
                      break;
                  }
      
                  time += (items / 6) * (cashierTimeLessThanFiveItems + cashierTimeFiveOrMoreItems);
                  totalTime += time;
                  currentItems += items;
              }
      
              return individualTimes;
          }
      }
      