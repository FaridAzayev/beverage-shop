# beverage-shop
This is application simulates shop, you can order beverages and print receipt.
In this project I tried demonstrate TDD approach for designing projects, also usage of fluent api, factory and command patterns

Basically this switch
  
        switch (beverageType) {
            case TEA:
                beverageList.add(new Tea(amount));
                break;
            case COFFEE:
                beverageList.add(new Coffee(amount));
                break;
            case MILKSHAKE:
                beverageList.add(new MilkShake(amount));
                break;
            default: throw new RuntimeException();
        }
        
converted to this Map
  
        Map<BeverageType, Request<?>> beverageRequests = new HashMap<>();
        beverageRequests.get(beverageType).add(amount);
