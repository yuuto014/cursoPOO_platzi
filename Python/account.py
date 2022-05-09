class Account:
    id = int
    name = str
    document = str
    email  =  str
    password = str
    
    def __int__(self,name,document):
        self.name = name
        self.document = document
