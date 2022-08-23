class Account:
    id          = int
    name        = str
    document    = int
    emal        = str
    password    = str

    def __init__(self, name, document):
        self.name       = name
        self.document   = document
